import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Dto } from './dto';
import { DtoLista } from './dto-lista';
import { Prodotto } from './prodotto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  prodotto: Prodotto = new Prodotto();
  prodotti: Prodotto[] = [];

  constructor(private http: HttpClient) {
    this.displayList();
  }

  add(){
    if (this.prodotto.nome != ""){
    let dto: Dto = new Dto();
    dto.prodotto = this.prodotto;
    let oss: Observable<DtoLista> = this.http.post<DtoLista>('http://localhost:8080/add', dto);
    oss.subscribe(d => this.prodotti=d.prodotti);
    this.prodotto.nome = "";
    }
  }

  removeAll(){
    let oss: Observable<DtoLista> = this.http.get<DtoLista>('http://localhost:8080/removeAll');
    oss.subscribe(d => this.prodotti = d.prodotti);
  }

  displayList(){
    let oss: Observable<DtoLista> = this.http.get<DtoLista>('http://localhost:8080/displayList');
    oss.subscribe(d => this.prodotti = d.prodotti);
  }

  remove(p: Prodotto){
    let dto: Dto = new Dto();
    dto.prodotto = p;
    let oss: Observable<DtoLista> = this.http.post<DtoLista>('http://localhost:8080/remove', dto);
    oss.subscribe(d => this.prodotti=d.prodotti);
  }
}
