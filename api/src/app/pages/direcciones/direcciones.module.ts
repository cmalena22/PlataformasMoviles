import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { DireccionesPageRoutingModule } from './direcciones-routing.module';

import { DireccionesPage } from './direcciones.page';
import { AgmCoreModule } from '@agm/core';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    DireccionesPageRoutingModule,
    AgmCoreModule.forRoot({
      apiKey:'AIzaSyDMNQzWtX8FAgLoMFdrMs4KC55TnLoA6hk'
    })
  ],
  declarations: [DireccionesPage]
})
export class DireccionesPageModule {}
