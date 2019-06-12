package com.lopez.bootcamp.controller;

import com.lopez.bootcamp.entity.Customer;
import com.lopez.bootcamp.repository.CustomerRepository;
import com.lopez.bootcamp.service.CustomerManagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class Controller{

      private CustomerRepository customerRepository;
      private CustomerManagementService customerManagementService;
//    private CustomUserDetailsService userService;
//
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }
//
//    @RequestMapping(value = "/signup", method = RequestMethod.GET)
//    public ModelAndView signup() {
//        ModelAndView modelAndView = new ModelAndView();
//        User user = new User();
//        modelAndView.addObject("user", user);
//        modelAndView.setViewName("signup");
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/signup", method = RequestMethod.POST)
//    public ModelAndView createNewUser(Customer customer, BindingResult bindingResult) {
//        ModelAndView modelAndView = new ModelAndView();
//        User userExists = userService.findUserByEmail(user.getEmail());
//        if (userExists != null) {
//            bindingResult
//                    .rejectValue("email", "error.user",
//                            "There is already a user registered with the username provided");
//        }
//        if (bindingResult.hasErrors()) {
//            modelAndView.setViewName("signup");
//        } else {
//            userService.saveUser(user);
//            modelAndView.addObject("successMessage", "User has been registered successfully");
//            modelAndView.addObject("user", new User());
//            modelAndView.setViewName("login");
//
//        }
//        return modelAndView;
//    }
//
    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public ModelAndView dashboard() {
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Customer customer = customerManagementService.findCustomerByEmail(auth.getName());
        modelAndView.addObject("currentUser", customer);
        modelAndView.addObject("fullName", "Welcome " + customer.getCustomerName());
        modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");
        modelAndView.setViewName("dashboard");
        return modelAndView;
    }
//
//    @RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
//    public ModelAndView home() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("home");
//        return modelAndView;
//    }
//
//    ArrayList<String> al;
 String s = "blah";
}
