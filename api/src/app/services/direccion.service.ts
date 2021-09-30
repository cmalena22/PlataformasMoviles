import { Injectable } from '@angular/core';
import { AngularFirestore } from '@angular/fire/firestore';
import { Observable } from 'rxjs';
import { Persona } from '../model/Persona';

@Injectable({
  providedIn: 'root'
})
export class DireccionService {

  constructor(public afs: AngularFirestore) { }


  saveContacto(contacto : Persona, newLocation){
    //

    console.log("LLego al servicio la direaaacion")
    console.log(newLocation)
    const refContacto=this.afs.collection("persona");
    if(contacto.uid==null)
    contacto.uid=this.afs.createId();
    contacto.direccion=newLocation
   // contacto.longitude=newLocation.longitude
    refContacto.doc(contacto.uid).set(Object.assign({},contacto),{merge:true})


}

getContactos(): Observable< any []>{
  return this.afs.collection("persona").valueChanges();

}
}
