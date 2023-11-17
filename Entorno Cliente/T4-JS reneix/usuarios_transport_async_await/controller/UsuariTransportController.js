import { findAllUsuarios } from "../service/UsuariService.js";
import { getTransportByid } from "../service/TransportService.js";

export async function findAllUsuariosTransport(){

    const usuaris = await findAllUsuarios();
    const transportsPromise = []
    for (let i = 0; i < usuaris.length; i++) {
        
        const transport = getTransportByid(usuaris[i].transport)
        transportsPromise.push(transport)
        
    }

    const transports = await Promise.all(transportsPromise);

    for (let i = 0; i < usuaris.length; i++) {
        usuaris[i].transportObject = transports[i];
    }

    return usuaris;

}