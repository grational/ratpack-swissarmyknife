/*
 * This ratpack file was auto generated by 'gigawatt'
 * @author d7392
 * @date 15-05-2019 15.32
 */
import static ratpack.groovy.Groovy.ratpack
import ratpack.http.MutableHeaders

ratpack {
	handlers {
		all {
			MutableHeaders headers = response.headers
			headers.set('Access-Control-Allow-Origin', '*')
			headers.set('Access-Control-Allow-Methods','GET')
			headers.set('Access-Control-Allow-Headers', 'x-requested-with, origin, content-type, accept')
			next()
		}
	}
}
