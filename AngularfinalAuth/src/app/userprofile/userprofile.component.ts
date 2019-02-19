import { Component, OnInit, ViewChild, NgModule } from '@angular/core';
import {MatPaginator, MatTableDataSource} from '@angular/material';
import { UserprofileServiceService } from '../services/userprofile-service.service';

export interface Tile {
  color: string;
  cols: number;
  rows: number;
  text: string;
}
export interface PeriodicElement {
  name: string;
  position: number;
}
const ELEMENT_DATA: PeriodicElement[] = [
  {position: 1, name: 'Hydroge ns rdctf dgfdhbcm dvi dkgfdvd dfg fdgdfgf dfgfdg dfgdfg dffhdg guhny'},
  {position: 2, name: 'Heliumwegfhdgcufyiguohef eft udjqe  qetuyg qeqiqyhdg qef'},
  {position: 3, name: 'Lithium'},
  {position: 4, name: 'Beryllium'},
];

@Component({
  selector: 'app-userprofile',
  templateUrl: './userprofile.component.html',
  styleUrls: ['./userprofile.component.css']
})
export class UserprofileComponent implements OnInit {
  bhaak: string;
  abc;
  constructor(private userService: UserprofileServiceService) { }
  tiles: Tile[] = [
    {text: 'One', cols: 1, rows: 4, color: 'white'},
    {text: 'Two', cols: 2, rows: 4, color: 'white'},
    {text: 'three', cols: 1, rows: 4, color: 'grey'},
  ];
  displayedColumns: string[] = ['position', 'name'];
  dataSource = new MatTableDataSource<PeriodicElement>(ELEMENT_DATA);

  @ViewChild(MatPaginator) paginator: MatPaginator;
  changemaadi() {
    this.bhaak = 'bhaak2';
  }
  ngOnInit() {
    this.userService.getUserProfile(0).subscribe(data => this.abc = data);
    console.log(this.abc);
    this.bhaak = 'bhaak1';
  }

}
