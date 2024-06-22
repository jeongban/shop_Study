package com.shop.exception;
//RuntimeException 예외처리를 커스텀하는 클래스
public class OutOfStockException extends RuntimeException{
    public OutOfStockException(String message){
        super(message);
    }
}
