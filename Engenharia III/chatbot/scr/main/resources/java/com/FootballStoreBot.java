package com.footballstorebot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.HashMap;
import java.util.Map;

public class FootballStoreBot extends TelegramLongPollingBot {

    private final Map<String, String> products = new HashMap<>();

    public FootballStoreBot() {
       
        products.put("1", "Camisa do Corinthians - R$199,99");
        products.put("2", "Camisa do Flamengo - R$189,99");
        products.put("3", "Camisa do Barcelona - R$299,99");
    }

    @Override
    public String getBotUsername() {
        return "FootballStoreBot"; 
    }

    @Override
    public String getBotToken() {
        return "123456789:ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            Message message = update.getMessage();
            String chatId = message.getChatId().toString();

            if (message.hasText()) {
                String userMessage = message.getText();

                switch (userMessage.toLowerCase()) {
                    case "/start":
                        sendMessage(chatId, "Bem-vindo à Loja de Roupas de Times! " +
                                "Digite /produtos para ver a lista de itens ou /ajuda para mais informações.");
                        break;

                    case "/produtos":
                        sendMessage(chatId, listarProdutos());
                        break;

                    case "/ajuda":
                        sendMessage(chatId, "Comandos disponíveis:\n" +
                                "/start - Iniciar o bot\n" +
                                "/produtos - Listar produtos disponíveis\n" +
                                "/comprar [ID] - Comprar um produto pelo ID");
                        break;

                    default:
                        if (userMessage.startsWith("/comprar")) {
                            String[] parts = userMessage.split(" ");
                            if (parts.length == 2 && products.containsKey(parts[1])) {
                                String produto = products.get(parts[1]);
                                sendMessage(chatId, "Compra realizada com sucesso!\nVocê comprou: " + produto);
                            } else {
                                sendMessage(chatId, "Produto não encontrado. Use /produtos para ver os itens disponíveis.");
                            }
                        } else {
                            sendMessage(chatId, "Comando não reconhecido. Use /ajuda para ver os comandos disponíveis.");
                        }
                        break;
                }
            }
        }
    }

    private String listarProdutos() {
        StringBuilder response = new StringBuilder("Produtos disponíveis:\n");
        for (Map.Entry<String, String> entry : products.entrySet()) {
            response.append(entry.getKey()).append(". ").append(entry.getValue()).append("\n");
        }
        return response.toString();
    }

    private void sendMessage(String chatId, String text) {
        try {
            SendMessage message = new SendMessage();
            message.setChatId(chatId);
            message.setText(text);
            execute(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new FootballStoreBot());
            System.out.println("Bot iniciado!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}