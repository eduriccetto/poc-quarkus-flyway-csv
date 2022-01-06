package org.acme.resource;

import org.acme.Bebida;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/bebida")
public class BebidaResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bebida> list() { return Bebida.listAll(); }

    @POST
    @Transactional()
    public void novaBebida() {
        Bebida bebida = new Bebida();
        bebida.nome = "Skol";
        bebida.tipo = "Cerveja";
        bebida.persist();

    }

}
