package com.company.View;

import com.company.controller.ProduktController;
import com.company.model.Produkt;


import java.util.*;


public class View {
    private ProduktController produktController;

    public View() {
        this.produktController = new ProduktController();
        Produkt produkt1 = new Produkt(1L,"ProduktA",12,"A1d2",2);
        produktController.addprodukt(produkt1);
    }


    public void run() {
        Scanner scanner = new Scanner(System.in);

        loop:
        while (true) {
            System.out.println("""
                     
                     0. Exit Program \r
                     1. Show all products \r
                     2. Add a product \r
                     3. Remove a product \r
                     4. Update a product \r
                    """);
            System.out.println("Enter input: ");
            int variant = scanner.nextInt();
            System.out.println("You've entered: " + variant);
            switch (variant) {
                case 0:
                    break loop;
                case 1:
                    showProdukts();
                    break;
                case 2:
                    addProdukts();
                    break;
                case 3:
                    deleteProdukt();
                    break;
                case 4:
                    updateProdukt();
                    break;

            }

        }
    }

    private void showProdukts(){
        for(Produkt produkt:produktController.getlist()){
            System.out.println(produkt.getId()+" "+produkt.getName()+" "+produkt.getPreis()+" "+produkt.getInitialeAnzahl()+" "+produkt.getSKU());

        }
    }

    private void addProdukts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You will need to write a few things that represent Movie attributes.");
        System.out.println("Enter product id:");
        try {
            Long id = scanner.nextLong();
            System.out.println("Enter product name:");
            scanner.nextLine(); //throw away the \n not consumed by nextInt()
            String name = scanner.nextLine();
            System.out.println("Enter product price:");
            double price = scanner.nextDouble();
            System.out.println("Enter product initial number:");
            int initialNumber = scanner.nextInt();
            System.out.println("Enter product SKU:");
            scanner.nextLine(); //throw away the \n not consumed by nextInt()
            String SKU = scanner.nextLine();

            Produkt produkt = new Produkt(id,name,price,SKU,initialNumber);

            produktController.addprodukt(produkt);
        } catch (Exception e) {
            throw e;
        }
    }

    private void deleteProdukt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id:");
        Long id = scanner.nextLong();
        produktController.deleteProdukt(id);
    }

    private void updateProdukt() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You will need to write a few things that represent product attributes.");
            System.out.println("Enter product id:");
            Long id = scanner.nextLong();
            System.out.println("Enter product name:");
            scanner.nextLine(); //throw away the \n not consumed by nextInt()
            String name = scanner.nextLine();
            System.out.println("Enter product price:");
            double price = scanner.nextDouble();
            System.out.println("Enter product initial number:");
            int initialNumber = scanner.nextInt();
            System.out.println("Enter product SKU:");
            scanner.nextLine(); //throw away the \n not consumed by nextInt()
            String SKU = scanner.nextLine();

            Produkt produkt = new Produkt(id,name,price,SKU,initialNumber);

            produktController.updateProdukt(produkt);
        } catch (Exception e) {
            throw e;
        }
    }
//
//    private void showActors() {
//        System.out.println(actorController.getAll());
//    }
//
//    private void addActor() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("You will need to write a few things that represent Actor attributes.");
//        System.out.println("Enter Actor id:");
//        try {
//            int id = scanner.nextInt();
//            System.out.println("Enter Actor name:");
//            scanner.nextLine(); //throw away the \n not consumed by nextInt()
//            String name = scanner.nextLine();
//            System.out.println("Enter Actor's number of Oscars:");
//            Integer nrOscars = scanner.nextInt();
//
//            actorController.addActor(id, name, nrOscars);
//        } catch (Exception e) {
//            throw e;
//        }
//    }
//
//    private void deleteActor() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Actor id:");
//        int id = scanner.nextInt();
//        actorController.deleteActor(id);
//    }
//
//    private void updateActor() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("You will need to write a few things that represent Actor attributes.");
//        System.out.println("Enter Actor id:");
//        try {
//            int id = scanner.nextInt();
//            System.out.println("Enter Actor name:");
//            scanner.nextLine(); //throw away the \n not consumed by nextInt()
//            String name = scanner.nextLine();
//            System.out.println("Enter Actor's number of Oscars:");
//            Integer nrOscars = scanner.nextInt();
//
//            actorController.updateActor(id, name, nrOscars);
//        } catch (Exception e) {
//            throw e;
//        }
//    }
//
//    private void addActorToMovie() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Movie id:");
//        try {
//            int movieId = scanner.nextInt();
//            System.out.println("Enter Actor id:");
//            int actorId = scanner.nextInt();
//            movieController.addActorToMovie(movieId, actorId);
//        } catch (Exception e) {
//            throw e;
//        }
//    }
//
//    private void getTopActors(){
//        List<Map.Entry<Actor, Integer>> topActors = movieController.getTopActors();
//        for(int i = topActors.size() - 1; i >= 0; i--){
//            System.out.println("Name: " + topActors.get(i).getKey().getName() + " " + topActors.get(i).getValue());
//        }
//    }
}
