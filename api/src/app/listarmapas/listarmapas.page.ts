import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Persona } from '../model/Persona';
import { DireccionService } from '../services/direccion.service';

@Component({
  selector: 'app-listarmapas',
  templateUrl: './listarmapas.page.html',
  styleUrls: ['./listarmapas.page.scss'],
})
export class ListarmapasPage implements OnInit {
  direcciones: Observable< any []> ;

  
  title = 'My first AGM project';
  lat = 51.678418;
  lng = 7.809007;
  constructor(public router: Router,private route: ActivatedRoute,
     private direccionService:DireccionService) {
      
}

  ngOnInit() {
    console.log("Aquiiiiiiiiiii")
    this.direcciones=this.direccionService.getContactos();
    this.direcciones.forEach(ciudad =>{
      //Aquí insertas el código de comparación que necesites
      console.log(ciudad)
 });
  }

}
