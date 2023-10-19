package Exercici1;

public class Persona {

    /*
        Explica els possibles problemes relacionats amb l’encapsulació que podria tenir la classe Persona.
        Posa un exemple de cada problema que vegis amb l’error, explica com el resoldries i reescriu la
        solució del problema.
     */

    /*

    ABANS

    public String nom;
    public String cognom;

     */

    // ARA

    private String nom;
    private String cognom;

    /*

    ABANS

    private Persona(String nom, String cognom){
        this.nom = nom;
        this.cognom = cognom;
    }

     */

    // ARA
    public Persona (String nom, String cognom){
        this.nom = nom;
        this.cognom = cognom;
    }

    public String getNomComplet(){
        if(nom == null || cognom == null){
            throw new RuntimeException("El nom o el cognom no poden ser nulls");
        }

        return nom + " " + cognom;
    }



    /*

    CANVIS:

        1- He posat privat els atributs, perque si son públics poden ser accessibles des de qualsevol classe,
        és un principal error del principi d'encapsulació.

        2- He posat el constructor públic, perque quan creem l'objecte persona podem utilitzar el constructor
        des de les altres classes, és un altre error del principi d'encapsulació.


     */


}
