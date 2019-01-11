package advanced.database.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class CreateCollection {
    public static void main(String[] args) {
        MongoClient mongo=new MongoClient("localhost",27017);
        MongoCredential credential=MongoCredential.createCredential("root","ila_practice",
                "password".toCharArray());
        System.out.println("Connected to the advanced.database successfully");
        MongoDatabase database = mongo.getDatabase("ila_practice");
        //advanced.database.createCollection("company_names");
        database.getCollection("company_names");
        System.out.println("Collection created successfully");
        //
        MongoCollection<Document> collection = database.getCollection("company_names");
        System.out.println("Collection sampleCollection selected successfully");

        Document document = new Document("title", "MongoDB")
                .append("id", 2)
                .append("description", "advanced/database")
                .append("likes", 100)
                .append("companyname", "css corp")
                .append("date", "9 Nov");
        collection.insertOne(document);
        System.out.println("Document inserted successfully");
    }
}
