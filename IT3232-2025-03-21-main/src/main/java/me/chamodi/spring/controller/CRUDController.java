package me.chamodi.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import me.chamodi.spring.model.student;

public class CRUDController<K, T> {
    private Map<K, T> objects = new HashMap<K, T>();

    public Map<K, T> getMap() {
		return objects;
	}

    @GetMapping("/")
    public Map<K, T> getAll(){
        return objects;
    }

    @GetMapping("/{id}")
    public T get(@PathVariable("id") K id){
        return objects.get(id);
    }

    @PostMapping("/add")
	public String addObject(T t, K Key){
		objects.put(K.get(id), object);
		return "New Object Added";
	}
	
	@DeleteMapping("/delete/{id}")
	public T deleteObject(@PathVariable("id") K id){
		T object = objects.get(id);
        if(object != null){
			objects.remove(id);
			return  object;
		}
        return null;
       
	}

	@PutMapping("/update/{id}")
	public T updateObject(@PathVariable("id") K id, @RequestBody K item){
		T object = objects.get(id);
        if(object != null){
			objects.put(objects.get(id), item);
			return object;
		}
		return null;
	}
}
