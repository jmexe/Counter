package com.jmexe.restlet.counter;

import com.jmexe.util.CounterManager;
import com.jmexe.util.TimeTool;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;

import java.sql.SQLException;

/**
 * Created by Jmexe on 10/10/14.
 */
public class CountResource extends ServerResource{

    String url = "";
    String msg = "";

    @Override
    protected void doInit() throws ResourceException {
        try {
            this.url = getClientInfo().getAddress();
            this.msg = (String) getRequestAttributes().get("appname");
        }
        catch (Exception e) {}

    }

    @Get
    public String represent() {
        long ts = TimeTool.GetUTC();
        try {
            CounterManager.addRecord(ts, url, 1, msg, "", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Add a record to application "+msg;
    }
}
