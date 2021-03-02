import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Dto } from './dto';
import { DtoLista } from './dto-lista';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  prodotto: string;
  lista: string[] = [];

  constructor(private http: HttpClient) { }

  add(){
    let dto: Dto = new Dto();
    dto.prodotto = this.prodotto;
    let oss: Observable<DtoLista> = this.http.post<DtoLista>('http://localhost:8080/add', dto);
    oss.subscribe(d => this.lista = d.lista);
  }

  removeAll(){
    let oss: Observable<DtoLista> = this.http.get<DtoLista>('http://localhost:8080/removeAll');
    oss.subscribe(d => this.lista = d.lista);
  }
}
