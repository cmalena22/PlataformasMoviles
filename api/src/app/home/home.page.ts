import { Component } from '@angular/core';
import { ProviderApiService } from '../services/provider-api.service';
@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
  datos
  constructor(public postServices:ProviderApiService) {}
  ngOnInit(){
    this.postServices.getDatos().subscribe(
      (data)=>{this.datos=data["results"];},
      (error)=> {console.log(error);}
    )
  }
}
