import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { ListarmapasPage } from './listarmapas.page';

describe('ListarmapasPage', () => {
  let component: ListarmapasPage;
  let fixture: ComponentFixture<ListarmapasPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListarmapasPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(ListarmapasPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
