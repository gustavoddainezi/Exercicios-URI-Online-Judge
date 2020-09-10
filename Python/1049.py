# -*- coding: utf-8 -*-
f1 = input()
f2 = input()
f3 = input()
        
if ("vertebrado" == f1):
    if ("ave" == f2):
        if ("carnivoro" == f3):
            print("aguia")
                
        elif ("onivoro" == f3):
            print("pomba")
                
            
    elif ("mamifero" == f2):
        if ("onivoro" == f3):
            print("homem")
                
        elif ("herbivoro" == f3):
            print("vaca")
           

elif ("invertebrado" == f1):
    if ("inseto" == f2):
        if ("hematofago" == f3):
            print("pulga")
                
        elif ("herbivoro" == f3):
            print("lagarta")
                
           
    elif ("anelideo" == f2):
        if ("hematofago" == f3):
            print("sanguessuga")
                
        elif ("onivoro" == f3):
            print("minhoca")