import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HardySkillComponent } from './hardy-skill.component';

describe('HardySkillComponent', () => {
  let component: HardySkillComponent;
  let fixture: ComponentFixture<HardySkillComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HardySkillComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HardySkillComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
