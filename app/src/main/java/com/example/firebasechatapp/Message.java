package com.example.firebasechatapp;

public class Message {
    private String text;
    private String name;
    private String sender;
    private String recipient;
    private String imgUrl;
    private boolean myMessage;

    public Message() {}

    public Message(String text, String name, String sender, String recipient, String imgUrl, boolean myMessage) {
        this.text = text;
        this.name = name;
        this.sender = sender;
        this.recipient = recipient;
        this.imgUrl = imgUrl;
        this.myMessage = myMessage;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSender() { return sender; }

    public void setSender(String sender) { this.sender = sender; }

    public String getRecipient() { return recipient; }

    public void setRecipient(String recipient) { this.recipient = recipient; }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public boolean getMyMessage() { return myMessage; }

    public void setMyMessage(boolean myMessage) { this.myMessage = myMessage; }
}
