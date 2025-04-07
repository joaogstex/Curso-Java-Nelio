package com.workeratv.view;

import com.workeratv.controller.WorkerController;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        WorkerController wc = new WorkerController();
        wc.initiate();
    }
}
