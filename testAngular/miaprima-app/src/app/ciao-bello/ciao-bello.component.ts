import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ciao-bello',
  templateUrl: './ciao-bello.component.html',
  styleUrls: ['./ciao-bello.component.css']
})
export class CiaoBelloComponent implements OnInit {

  constructor(){
  }
    
  ngOnInit() : void {
  }
  
  name: string = "Federico";

  Saluta(): void
  {
    alert("Ciao" + this.name);
  }
}
