//package com.cycleRental.cycleRentalCRUD.controller;
//
//import java.util.Collections;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cycleRental.cycleRentalCRUD.bean.CycleRental;
//import com.cycleRental.cycleRentalCRUD.service.CycleRentalService;
//
//@RestController
//public class CycleRentalController {
//
//	@Autowired
//	private CycleRentalService cycleRentalService;
//	
//	@RequestMapping("/cycleRental")
//	public List<CycleRental> getCycleReatal(@RequestParam(value="id", required = false) String id){
//		if(id != null) {
//		return Collections.singletonList(cycleRentalService.getCycleRental(id));	
//		}
//		else{
//			return cycleRentalService.getAllCycleRental();
//		}
//	}
//	
//	@RequestMapping("/cycleRental/form")
//	public List<CycleRental> getCycleRentalFrm(@RequestParam(value = "id", required = false) String id) {
//	    if (id != null) {
//	        return Collections.singletonList(cycleRentalService.getCycleRental(id));
//	    }
//	    
//	    return cycleRentalService.getAllCycleRental();
//	}
//	
////	@RequestMapping(method= RequestMethod.GET, value= "/cycleRental/{id}")
////		public void getCycleRental(@PathVariable String id) {
////			cycleRentalService.getCycleRental(id);
////	} 
//	
//	
//	
//
//	
//	@RequestMapping(method = RequestMethod.POST, value="/cycleRental")
//	public void addCycleRental(@RequestBody CycleRental cycleRental) {
//		cycleRentalService.addCycleRental(cycleRental);
//	}
//	
//	
//	@RequestMapping(method = RequestMethod.PUT, value = "/cycleRental/{id}")
//	public void updateCycleRental(@PathVariable String id, @RequestBody CycleRental updatedCycleRental) {
//	    CycleRental existingCycleRental = cycleRentalService.getCycleRental(id);
//
//	    if (existingCycleRental != null) {
//	        if (updatedCycleRental.getRentalName() != null) {
//	            existingCycleRental.setRentalName(updatedCycleRental.getRentalName());
//	        }
//
//	        if (updatedCycleRental.getRentalAddress() != null) {
//	            existingCycleRental.setRentalAddress(updatedCycleRental.getRentalAddress());
//	        }
//
//	        if (updatedCycleRental.getRentalPrice() != 0.0) {
//	            existingCycleRental.setRentalPrice(updatedCycleRental.getRentalPrice());
//	        }
//
//	        if (updatedCycleRental.getRentalDate() != null) {
//	            existingCycleRental.setRentalDate(updatedCycleRental.getRentalDate());
//	        }
//
//	        if (updatedCycleRental.getRentalPaid() != null) {
//	            existingCycleRental.setRentalPaid(updatedCycleRental.getRentalPaid());
//	        }
//
//
//	        cycleRentalService.updateCycleRental(id, existingCycleRental);
//	    }
//	}
//
//	
//	@RequestMapping(method = RequestMethod.DELETE, value="/cycleRental/{id}")
//	public void deleteCycleRental(@PathVariable String id) {
//		cycleRentalService.deleteCycleRental(id);
//	}
//}


package com.cycleRental.cycleRentalCRUD.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cycleRental.cycleRentalCRUD.bean.CycleRental;
import com.cycleRental.cycleRentalCRUD.service.CycleRentalService;

@RestController
public class CycleRentalController {

    @Autowired
    private CycleRentalService cycleRentalService;

    @RequestMapping("/cycleRental")
    public List<CycleRental> getCycleRental(@RequestParam(value = "id", required = false) String id) {
        if (id != null) {
            return Collections.singletonList(cycleRentalService.getCycleRental(id));
        } else {
            return cycleRentalService.getAllCycleRental();
        }
    }

    @RequestMapping("/cycleRental/form")
    public List<CycleRental> getCycleRentalForm(@RequestParam(value = "id", required = false) String id) {
        if (id != null) {
            return Collections.singletonList(cycleRentalService.getCycleRental(id));
        } else {
            return cycleRentalService.getAllCycleRental();
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/cycleRental")
    public void addCycleRental(@RequestBody CycleRental cycleRental) {
        cycleRentalService.addCycleRental(cycleRental);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/cycleRental/{id}")
    public void updateCycleRental(@PathVariable String id, @RequestBody CycleRental updatedCycleRental) {
        CycleRental existingCycleRental = cycleRentalService.getCycleRental(id);

        if (existingCycleRental != null) {
            if (updatedCycleRental.getRentalName() != null) {
                existingCycleRental.setRentalName(updatedCycleRental.getRentalName());
            }

            if (updatedCycleRental.getRentalAddress() != null) {
                existingCycleRental.setRentalAddress(updatedCycleRental.getRentalAddress());
            }

            if (updatedCycleRental.getRentalPrice() != 0.0) {
                existingCycleRental.setRentalPrice(updatedCycleRental.getRentalPrice());
            }

            if (updatedCycleRental.getRentalDate() != null) {
                existingCycleRental.setRentalDate(updatedCycleRental.getRentalDate());
            }

            if (updatedCycleRental.isRentalPaid() != existingCycleRental.isRentalPaid()) {
                existingCycleRental.setRentalPaid(updatedCycleRental.isRentalPaid());
            }

            cycleRentalService.updateCycleRental(id, existingCycleRental);
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/cycleRental/{id}")
    public void deleteCycleRental(@PathVariable String id) {
        cycleRentalService.deleteCycleRental(id);
    }
}
