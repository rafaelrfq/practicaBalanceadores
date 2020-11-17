<#include "../base.ftlh">

<#macro page_body>
    <br><br>
    <h2 class="text-center">List of Polls</h2><br>
    <div class="container">
        <div>
            <a class="btn btn-outline-primary" href="/polls/create">New Poll</a>
        </div>

        <br>
        <table class="table table-striped">
            <thead class="thead-dark">
            <tr>
                <th scope="col">Date Created</th>
                <th scope="col">User's Name</th>
                <th scope="col">Values</th>
                <th scope="col">Comment</th>
                <th scope="col">Options</th>
            </tr>
            </thead>
            <tbody>
            <#if polls??>
                <#list polls as poll>
                    <tr>
                        <th scope="row">${poll.dateCreated}</th>
                        <td>${poll.userGradedPoll.name}</td>
                        <td>
                            <p style="font-weight: bold">Questions</p>
                            <ol>
                                <li>Question 1: ${poll.valueQuestion1}</li>
                                <li>Question 2: ${poll.valueQuestion2}</li>
                                <li>Question 3: ${poll.valueQuestion3}</li>
                            </ol>
                        </td>
                        <td>${poll.valueQuestion4}</td>
                        <td>
                            <a class="btn btn-danger" href="/polls/delete=${poll.id}">Delete Poll</a>
                        </td>
                    </tr>
                </#list>
            <#else>
                <tr>
                    <td colspan="5">No poll data was found</td>
                </tr>
            </#if>
            </tbody>
        </table>
    </div>
</#macro>

<@display_page/>