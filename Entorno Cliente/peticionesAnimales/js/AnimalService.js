
function getAnimals(){
    fetch("https://theteacher.codiblau.com/public/vetplus/getAnimals")
        .then(function(respuesta){
            return respuesta.json()
        })
        .then(function(animales){
            animales.forEach(element => {
                document.querySelector("#app").innerHTML += `<p>${element.nom}</p>`
            });
        })
}

function getAnimal(){}

function save(){}

getAnimals()