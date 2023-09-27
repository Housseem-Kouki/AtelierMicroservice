package com.esprit.microservices.candidatms.Services;

import com.esprit.microservices.candidatms.Entities.Candidat;
import com.esprit.microservices.candidatms.Repositories.CandidatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CandidatService {
    @Autowired
    private CandidatRepo candidateRepository;
    public Candidat addCandidat(Candidat candidate) {
        return candidateRepository.save(candidate);
    }
    public Candidat updateCandidat(int id, Candidat newCandidat) {
        if (candidateRepository.findById(id).isPresent()) {

            Candidat existingCandidat = candidateRepository.findById(id).get();  existingCandidat.setNom(newCandidat.getNom());
            existingCandidat.setPrenom(newCandidat.getPrenom());
            existingCandidat.setEmail(newCandidat.getEmail());
            return candidateRepository.save(existingCandidat);
        } else
            return null;
    }
    public String deleteCandidat(int id) {
        if (candidateRepository.findById(id).isPresent()) {
            candidateRepository.deleteById(id);
            return "candidat supprimé";
        } else
            return "candidat non supprimé";
    }

}