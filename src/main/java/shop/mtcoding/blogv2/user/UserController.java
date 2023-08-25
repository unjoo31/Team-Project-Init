package shop.mtcoding.blogv2.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

 // 회원정보 화면 호출
    @GetMapping("/user/updateForm")
    public String updateForm() {
      
        return "user/updateForm";
    }

    @Autowired
    private UserService userService;

    @GetMapping("/joinForm")
    public String joinForm() {
        return "/user/joinForm";
    }

    @PostMapping("/join")
    public String join() {
        userService.회원가입();
        return "redirect:/loginForm";
    }
}
