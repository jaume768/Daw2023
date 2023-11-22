import { Categoria } from "../model/Categoria.js";

export class CategoriaService{
    
    async findAll(){
        const categoriaFetch = await fetch("https://theteacher.codiblau.com/public/exercicis/galeria/categories");

        const categoriesResoltes = await categoriaFetch.json()
        const categoriEntries= Object.entries(categoriesResoltes)

        const categories = []

        for (let i = 0; i < categoriEntries.length; i++) {
            
            const key = categoriEntries[i][0];
            const valor = categoriEntries[i][1];
            categories.push(new Categoria(valor,key))
        }

        

        return categories;
    }

}