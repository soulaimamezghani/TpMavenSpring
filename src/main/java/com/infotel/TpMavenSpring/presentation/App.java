package com.infotel.TpMavenSpring.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpMavenSpring.metier.Formation;
import com.infotel.TpMavenSpring.metier.Personne;
import com.infotel.TpMavenSpring.metier.Promotion;
import com.infotel.TpMavenSpring.service.Iservice;
import com.infotel.TpMavenSpring.service.ServiceImpl;

/**
 * Classe de demarrage de l'application
 * @author IN-MP-023
 */
public class App {
	/**
	 * la methode main est statique,elle est chargée en mémoire 
	 * au demarrage de l'application et peut donc etre utlisée avant la création de tout objet
	 * 
	 * @param args
	 */
    public static void main( String[] args )
    {
//         Personne p = new Personne();
    	//1-Charger le fichier de configuration spring
    	//Spring COMMANDE
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");//se charge 1seufois meme j'ai plusieur instance c'est un singleton
    	
//      //2- récuperer le bean à utiliser
//    	//le Main Commande
     	Personne p =context.getBean("pers",Personne.class);//getBean remplace new
     	Personne x =context.getBean("pers2",Personne.class);
       	Personne p3 =context.getBean("pers3",Personne.class);
//    	
//    	//3-Utiliser le bean
//    	
      p.setIdPersonne(1);
       p.setAge(12);//cest pa obliagatoire de l'appeler p dans le appcontext je peut le nommer x
       p.setNom("mez");
       p.setPrenom("Soulaima");
       System.out.println(p);
       System.out.println(x);
       System.out.println(p3+""+p3.getAdresse());
       //test injection en couche
       Personne p4= context.getBean("pers4" ,Personne.class);//spring cree les objets
       Iservice service =context.getBean("service",ServiceImpl.class);//spring cree les objets
       
       service.ajouterPersonne(p4);
      
   	
       //2- récuperer le bean à utiliser
     	//le Main Commande
     	Formation a =context.getBean("format",Formation.class);//getBean remplace new
     	Promotion pr =context.getBean("promo",Promotion.class);
     	Formation b =context.getBean("format2",Formation.class);
    	Promotion pr1 =context.getBean("promo2",Promotion.class);
    	Promotion pr2 =context.getBean("promo3",Promotion.class);
    	
     	
     	
     	//3-Utiliser le bean
    	a.setIdformation(3);
    	a.setNomformation("arabe");
     	System.out.println(a);
     	
       	pr.setIdPromotion(17);
         pr.setNomPromotion("espagnol");
     	System.out.println(pr);
     	
//     	
//     	b.setIdformation(9);
//        b.setNomformation("chimie");
        System.out.println(b);
        

        
        
        pr1.setIdPromotion(7);
        pr1.setNomPromotion("dotnet");
        System.out.println(pr1);
        System.out.println(pr2+""+pr2.getFormation());
       
       
       
       
       
       //fermer le contexte
       context.close();
    }
    
}
