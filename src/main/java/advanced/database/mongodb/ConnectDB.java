package advanced.database.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;

public class ConnectDB {
    public static void main(String[] args) {
        MongoClient mongo=new MongoClient("localhost",27017);
        MongoCredential credential;
        credential = MongoCredential.createCredential("root", "ila_practice",
                "password".toCharArray());
        System.out.println("Connected to the advanced.database successfully");
        MongoDatabase database = mongo.getDatabase("ila_practice");
        System.out.println("Credentials ::"+ credential);


    }
}
