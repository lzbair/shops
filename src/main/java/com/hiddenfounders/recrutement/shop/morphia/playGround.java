package com.hiddenfounders.recrutement.shop.morphia;

import com.hiddenfounders.recrutement.shop.morphia.model.Shop;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

import java.util.List;

public class playGround {


    public static void main(String... args) {
        final Morphia morphia = new Morphia();
        morphia.mapPackage("com.hiddenfounders.recrutement.shop.model");

        final Datastore datastore = db(morphia);

        final Query<Shop> query = datastore.createQuery(Shop.class);
        final List<Shop> shops = query.asList();
        shops.stream().forEach(System.out::println);
    }

    private static Datastore db(Morphia morphia) {
        MongoClient client = new MongoClient(new MongoClientURI("mongodb://localhost:9005"));
        return morphia.createDatastore(client, "shops");
    }
}
