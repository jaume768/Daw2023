import { Usuario } from "../model/Usuario.js";

export async function findAllUsuarios() {

    const getUsuaris = fetch(`https://theteacher.codiblau.com/public/exercicis/other/usuaris/list`)

        .then(function (respuesta) {
            return respuesta.json();
        })

    const usuariosResueltos = await getUsuaris;


    const all = await Promise.all(usuariosResueltos.map(function (jsonUsuari) {
        return jsonToUsuari(jsonUsuari);
    }))

    return all;

}


function jsonToUsuari(json) {
    return new Usuario(json.nom, json.cognom1, json.cognom2, json.transport_idtransport);
}