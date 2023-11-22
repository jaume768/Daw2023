export class Persona{
    #nom;
    #cognom = "llinas";
    #edat;

    constructor(nom,edat){
        this.#nom = nom;
        this.#edat = edat;
    }

    getNomComplet(){
        return this.#nom + " " + this.#cognom
    }

    // getter

    get edad(){
        return this.edad;
    }

    getNom(){
        return this.#nom;
    }
    getCognom(){
        return this.#cognom;
    }
}