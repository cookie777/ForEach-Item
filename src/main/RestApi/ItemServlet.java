package main.RestApi;

import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ItemServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String requestUrl = request.getRequestURI();
        String name = requestUrl.substring("/items/".length());

        Item item = DataStore.getInstance().getItem(name);

        if(item != null){
            String json = "{\n";
            json += "\"name\": " + JSONObject.quote(item.getName()) + ",\n";
            json += "\"size\": " + JSONObject.quote(item.getSize()) + ",\n";
            json += "\"weight\": " + item.getSize() + "\n";
            json += "}";
            response.getOutputStream().println(json);
        }
        else{
            //That item wasn't found, so return an empty JSON object. We could also return an error.
            response.getOutputStream().println("{}");
        }
    }



    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String name = request.getParameter("name");
        String size = request.getParameter("size");
        Integer weight = Integer.parseInt(request.getParameter("weight"));

        DataStore.getInstance().putItem(new Item(name, size, weight));
    }
}
