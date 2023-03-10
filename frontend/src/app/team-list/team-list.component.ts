import { Component, OnInit } from '@angular/core';
import { Team } from '../team';
import { TeamService } from '../team-service.service';

@Component({
  selector: 'app-team-list',
  templateUrl: './team-list.component.html',
  styleUrls: ['./team-list.component.scss']
})
export class TeamListComponent implements OnInit {

  teams: Team[];

  constructor(private teamService: TeamService) {
  }

  async ngOnInit() {
    console.log('passando')
    this.teamService.findAll().subscribe(data => {
      console.log(data)
      this.teams = data;
    });
  }
}