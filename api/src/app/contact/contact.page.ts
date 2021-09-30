import { Component, OnInit } from '@angular/core';
import { Camera, CameraOptions } from '@ionic-native/camera/ngx';
import { Persona } from '../model/Persona';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.page.html',
  styleUrls: ['./contact.page.scss'],
})
export class ContactPage implements OnInit {
  imgData:string
  imgURL: string
  persona:Persona= new Persona()
  constructor(private camera: Camera) { }

  ngOnInit() {
  }

  /*
  imageSeleccionado(data){
    this.imgData=data;

  }*/
  imageSeleccionada(data){
    this.imgData=data
  }
  
  uploadFinished(data){
    this.persona.image=data;
  }
}
