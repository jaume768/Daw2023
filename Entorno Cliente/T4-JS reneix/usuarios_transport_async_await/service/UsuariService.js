import { Usuario } from "../model/Usuario.js";
import { getTransportByid } from "./TransportService.js";

export async function findAllUsuarios() {

    const getUsuaris = fetch(`https://theteacher.codiblau.com/public/exercicis/other/usuaris/list`)

        .then(function (respuesta) {
            return respuesta.json();
        })

    const usuariosResueltos = await getUsuaris;

    return usuariosResueltos.map(async function (jsonUsuari) {
        return await jsonToUsuari(jsonUsuari);
    });
}


async function jsonToUsuari(json) {
    const transport = await getTransportByid(json.transport_idtransport);
    return new Usuario(json.nom, json.cognom1, json.cognom2, transport);
}