package com.hle;

import com.hle.clashofanimals.impl.Animal;
import com.hle.clashofanimals.impl.animals.Elephant;

public class ApplicationEntry {
    public static void main(String[] args) {

        
         Animal elephant = Elephant.builder().name("").build();
         Tigre tigre1 = new Tigre("Tigre", 2);
         
         IAttackEffect attackWithKnife= new AttackEffect2D("Knife");

         tigre1.setTypeDarme(attackWithKnife);

         tigre1.attaquer(elephant);


         tigre1.setTypeDarme(new AttackEffect2D("Sword"));



         
    }
}
