
export async function x(){
    const nombrespromise = []
    for (let i = 1; i < 50; i++) {

       const promesa = fetch("https://theteacher.codiblau.com/public/exercicis/other/asincron-get?num="+i)
                        .then(function(resposta){
                            return resposta.text()
                        })
        nombrespromise.push(promesa)                
    
    }

    return await Promise.all(nombrespromise);
}
