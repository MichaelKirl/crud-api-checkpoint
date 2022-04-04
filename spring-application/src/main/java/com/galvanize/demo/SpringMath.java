package com.galvanize.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/math")
@RestController
public class SpringMath {

    @RequestMapping("/volume")
    public String welcomePage() {
        return "Welcome to volume";
    }
    @RequestMapping("/volume/{length}/{width}/{height}")
    public String returnVolume(@PathVariable int length, int width, int height) {
        int product = length * width * height;

        return String.format("The volume of a %dx%dx%d rectangle is %d", length, width, height, product);
    }

    @RequestMapping("/calculate")
    public String returnCalculateString(@RequestParam String operation, @RequestParam int x, @RequestParam int y) {
        switch (operation) {
            case "add":
                return String.format("%d + %d = %d", x, y, x + y);
            case "subtract" :
                return String.format("%d - %d = %d", x, y, x - y);
            case "multiply" :
                return String.format("%d * %d = %d", x, y, x * y);
            case "divide" :
                double newX = x;
                double newY = y;
                return String.format("%.2f / %.2f = %.2f", newX, newY, newX / newY);
            default :
                return "Unsupported Operation";
        }
    }
}
