import { Transport } from "../model/Transport.js";

export async function getTransportByid(id) {


    const peticion = fetch("https://theteacher.codiblau.com/public/exercicis/other/usuaris/transport",
        {
            method: 'POST',
            headers: {
                "Content-Type": "application/x-www-form-urlencoded"
            },
            body: 'idtransport=' + id
        }) //para decirle que es un POST pasamos un segundo parámetro que es un OBJETO
        .then(function (resposta) {
            return resposta.json();
        });

        const transport = await peticion;
        return jsonToTransport(transport);

}

function jsonToTransport(json) {
    return new Transport(json.id, json.url)
}


