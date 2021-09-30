import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { ListarmapasPageRoutingModule } from './listarmapas-routing.module';

import { ListarmapasPage } from './listarmapas.page';
import { BrowserModule } from '@angular/platform-browser';
import { AgmCoreModule } from '@agm/core';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    ListarmapasPageRoutingModule,
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyDMNQzWtX8FAgLoMFdrMs4KC55TnLoA6hk'
    })
  ],
  declarations: [ListarmapasPage]
})
export class ListarmapasPageModule {}
