import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, NavigationExtras, Router } from '@angular/router';
import { Persona } from 'src/app/model/Persona';
import { DireccionService } from 'src/app/services/direccion.service';
import { LocationService } from 'src/app/services/location.service';

@Component({
  selector: 'app-direcciones',
  templateUrl: './direcciones.page.html',
  styleUrls: ['./direcciones.page.scss'],
})
export class DireccionesPage implements OnInit {
  persona : Persona= new Persona

  title = 'My first AGM project';
  lat = 51.678418;
  lng = 7.809007;

  current = {
    latitude: '',
    longitude: '',
    address: ''
  }

  newLocation = {
    latitude: '',
    longitude: '',
    address: ''
  }

  constructor(private locationService: LocationService,
    public router: Router,private route: ActivatedRoute,
     private direccionService:DireccionService) {

      this.route.queryParams.subscribe(params => {
        console.log(params);
        if (this.router.getCurrentNavigation().extras.queryParams) {
          this.persona = this.router.getCurrentNavigation().extras.queryParams.persona;
          console.log(this.persona);
          }
      });


     }

  async ngOnInit() {

    this.current = await this.locationService.getCurrentLocation(false);
  }

  setNewLocation(event){
    if(event){
      this.newLocation.latitude = event.lat;
      this.newLocation.longitude = event.lng;
      this.locationService.getAddressOfLocation(this.newLocation);
    }
  }

  guardar(newLocation){

    console.log(this.persona)
    console.log("direeeeeeeeeee")
    console.log(newLocation)
    console.log(this.persona)
    //navegar en diferente paginas
   this.direccionService.saveContacto(this.persona, this.newLocation)
      let navigationExtras: NavigationExtras={
      queryParams:{
        message:this.persona,
       
      }
    }; 
   
  //dirigise a otra pagina y pasarle los parametros
  this.router.navigate(['/listarmapas']);
   

  }


}
