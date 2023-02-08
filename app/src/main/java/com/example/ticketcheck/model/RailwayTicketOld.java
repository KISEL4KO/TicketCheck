package com.example.ticketcheck.model;

public class RailwayTicketOld extends RailwayTicket{


    private float ticketDiscount2; // скидка на пожилой   билет

    // создание пустого конструктора
    public RailwayTicketOld () {
    }
    // создание конструктора исходных данных пожилового  билета (стоимость билета, количество билетов, скидка)
    public RailwayTicketOld (float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount2 = ticketDiscount2;
    }

    // переопределение метода подсчёта стоимости пожилых  билетов
    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount2))/100; // нужно умножить количество билетов на стоимость одного билета и на скидку и всё разделить на 100
    }
}

