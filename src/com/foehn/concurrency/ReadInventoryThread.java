/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foehn.concurrency;

/**
 *
 * @author 10405
 */
public class ReadInventoryThread extends Thread {

    @Override
    public void run() {
        System.out.println("Printing zoo inventory");
    }

    public static void main(String[] args) {
        (new Thread(new ReadInventoryThread())).start();
    }
}
