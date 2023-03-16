import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CiaoBelloComponent } from './ciao-bello.component';

describe('CiaoBelloComponent', () => {
  let component: CiaoBelloComponent;
  let fixture: ComponentFixture<CiaoBelloComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CiaoBelloComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CiaoBelloComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
