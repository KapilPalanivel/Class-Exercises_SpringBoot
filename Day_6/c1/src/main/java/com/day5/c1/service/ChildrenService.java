package com.day5.c1.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;
import com.day5.c1.model.Children;
import com.day5.c1.repository.ChildrenRepo;

@Service
public class ChildrenService {
    @Autowired
    private ChildrenRepo childrenRepo;

    public boolean addChild(Children child) {
        try {
            childrenRepo.save(child);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean addChild(List<Children> child) {
        try {
            childrenRepo.saveAll(child);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Page<Children> getChildSorted(int offse, int page, String field) {
        Pageable pg = PageRequest.of(offse, page, Sort.by(field));
        Page<Children> option = childrenRepo.findAll(pg);
        return option;
    }

    public Page<Children> getChild(int offset, int pagesize) {
        Pageable pg = PageRequest.of(offset, pagesize);
        Page<Children> option = childrenRepo.findAll(pg);
        return option;
    }

    public List<Children> getChildrens(String field) {
        return childrenRepo.findAll(Sort.by(field));
    }
}
