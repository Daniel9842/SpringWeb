package edu.escuelaing.arsw.springWeb.springController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import edu.escuelaing.arsw.springWeb.picasYfamas.Game;
import edu.escuelaing.arsw.springWeb.htmlTemplates.StringTemplates;

@RestController
public class controllerIndex {
	Game game = new Game();
	StringTemplates html = new StringTemplates();

	public controllerIndex() {
		game.randomNumber();
	}

	@GetMapping("/index")
	public String index(@RequestParam(value = "number", defaultValue = "0000") String number) {
		int nums[] = {Integer.parseInt(number.substring(0,1)),Integer.parseInt(number.substring(1,2)),Integer.parseInt(number.substring(2,3)),Integer.parseInt(number.substring(3,4))};
		game.resetPicasFamas();
		game.numbers(nums);
		if(game.getWin()==false) {
			return html.getIndexHtml()+ String.format("Tus resultados son: %s %s %s!","picas:"+ game.getPicas(),"famas:"+ game.getFamas(),"numeros:"+ game.getNumbers());
		}else{
			game = new Game();
			game.resetGame();
			return html.getWinHtml();
			
		}
		
		
	}

}
