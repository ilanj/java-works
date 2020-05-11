package advanced.database.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Iterator;

public class GetDocumentCollection {
    public static void main(String[] args) {
        MongoClient mongoClient=new MongoClient("localhost",27017);
        MongoCredential mongoCredential=MongoCredential.createCredential("root","ila_practice","password".toCharArray());
        System.out.println("connected to db");
        //
        MongoDatabase db=mongoClient.getDatabase("ila_practice");

        MongoCollection<Document> getDocCollection=db.getCollection("company_names");
        FindIterable<Document> itrDoc=getDocCollection.find();

        Iterator itr=itrDoc.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
