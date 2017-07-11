package pl.javastart.component;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import pl.javastart.model.Participant;

@Component
public class EventHolder {
	private List<Participant> participiants;

	public EventHolder(){
		this.participiants=new LinkedList<>();
	}
	
	public void addParticipant(Participant participant){
		this.participiants.add(participant);
	}
	
	public List<Participant> getParticipants(){
		return this.participiants;
	}
	
	public boolean checkRegistration(Participant participiant){		
		return this.participiants.contains(participiant);
	}
}
