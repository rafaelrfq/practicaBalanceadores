<#include "../base.ftlh">

<#macro page_body>
    <br><br>
    <h2 class="text-center">New Poll</h2>
    <br>

    <div class="container">
        <form action="/polls/create" method="post" modelAttribute="gradedPoll">
            <div class="form-group">
                <label>${poll.getquestion1()}</label><br>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="rd1" type="radio" name="valueQuestion1" value="1" required>
                    <label class="form-check-label" for="rd1"> 1</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="rd2" type="radio" name="valueQuestion1" value="2" required>
                    <label class="form-check-label" for="rd2"> 2</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="rd3" type="radio" name="valueQuestion1" value="3" required>
                    <label class="form-check-label" for="rd3"> 3</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="rd4" type="radio" name="valueQuestion1" value="4" required>
                    <label class="form-check-label" for="rd4"> 4</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="rd5" type="radio" name="valueQuestion1" value="5" required>
                    <label class="form-check-label" for="rd5"> 5</label>
                </div>
            </div>

            <div class="form-group">
                <label>${poll.getquestion2()}</label><br>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="rd1" type="radio" name="valueQuestion2" value="1" required>
                    <label class="form-check-label" for="rd1"> 1</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="rd2" type="radio" name="valueQuestion2" value="2" required>
                    <label class="form-check-label" for="rd2"> 2</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="rd3" type="radio" name="valueQuestion2" value="3" required>
                    <label class="form-check-label" for="rd3"> 3</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="rd4" type="radio" name="valueQuestion2" value="4" required>
                    <label class="form-check-label" for="rd4"> 4</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="rd5" type="radio" name="valueQuestion2" value="5" required>
                    <label class="form-check-label" for="rd5"> 5</label>
                </div>
            </div>

            <div class="form-group">
                <label>${poll.getquestion3()}</label><br>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="rd1" type="radio" name="valueQuestion3" value="1" required>
                    <label class="form-check-label" for="rd1"> 1</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="rd2" type="radio" name="valueQuestion3" value="2" required>
                    <label class="form-check-label" for="rd2"> 2</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="rd3" type="radio" name="valueQuestion3" value="3" required>
                    <label class="form-check-label" for="rd3"> 3</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="rd4" type="radio" name="valueQuestion3" value="4" required>
                    <label class="form-check-label" for="rd4"> 4</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" id="rd5" type="radio" name="valueQuestion3" value="5" required>
                    <label class="form-check-label" for="rd5"> 5</label>
                </div>
            </div>

            <div class="form-group">
                <label for="valueQuestion4">${poll.getquestion4()}</label>
                <textarea class="form-control" id="valueQuestion4" name="valueQuestion4" cols="50" rows="6" placeholder="Introduzca su comentario aqui..."></textarea>
            </div>

            <br>
            <button class="btn btn-primary" type="submit">Submit</button>
        </form>
    </div>

</#macro>

<@display_page/>