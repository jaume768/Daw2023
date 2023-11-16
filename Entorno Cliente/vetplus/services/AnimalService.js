
import { Animal } from "../model/Animal.js"

export async function getAnimals(){
    const response = await fetch("https://theteacher.codiblau.com/public/vetplus/getAnimals");
    const animalesResolts = await response.json();

    return animalesResolts.map(function(animal){
        return JsonToAnimal(animal)
    })

}

export async function getAnimal(id){
    const response = await fetch("https://theteacher.codiblau.com/public/vetplus/getAnimals");
    const animalesResolts = await response.json();

    const animalEncontrado = animalesResolts.find(function (animal) {
        return animal.idanimal == id;
    });

    if (animalEncontrado) {
        return JsonToAnimal(animalEncontrado);
    } else {
        console.error(`No se encontró ningún animal con el ID ${id}`);
        return null;
    }
}



function JsonToAnimal(json){
    return new Animal(json.idanimal,json.nom,json.sexe,json.numregistre,json.tipus)
}